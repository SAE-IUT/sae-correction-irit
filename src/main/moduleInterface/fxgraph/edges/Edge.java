package fxgraph.edges;


import fxgraph.cells.AbstractCell;
import fxgraph.graph.Graph;
import fxgraph.graph.ICell;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Edge extends AbstractEdge {

	private transient final StringProperty textProperty;

	public Edge(ICell source, ICell target) {
		super(source, target);
		textProperty = new SimpleStringProperty();
	}

	@Override
	public EdgeGraphic getGraphic(Graph graph) {
		return new EdgeGraphic(graph, this, textProperty, (AbstractCell) this.getSource(), (AbstractCell) this.getTarget());
	}

	public StringProperty textProperty() {
		return textProperty;
	}

	public static class EdgeGraphic extends Pane {

		private final Group group;
		private final Line line;
		private final Text text;

		public EdgeGraphic(Graph graph, Edge edge, StringProperty textProperty, AbstractCell source, AbstractCell target) {
			group = new Group();
			line = new Line();

			final DoubleBinding sourceX, sourceY;
			final DoubleBinding targetX, targetY;

			sourceX = edge.getSource().getXAnchor(graph, edge, source.getSourceEdgeXPosition());
			sourceY = edge.getSource().getYAnchor(graph, edge, source.getSourceEdgeYPosition());
			targetX = edge.getTarget().getXAnchor(graph, edge, target.getTargetEdgeXPosition());
			targetY = edge.getTarget().getYAnchor(graph, edge, target.getTargetEdgeYPosition());

			line.startXProperty().bind(sourceX);
			line.startYProperty().bind(sourceY);

			line.endXProperty().bind(targetX);
			line.endYProperty().bind(targetY);
			group.getChildren().add(line);

			final DoubleProperty textWidth = new SimpleDoubleProperty();
			final DoubleProperty textHeight = new SimpleDoubleProperty();
			text = new Text();
			text.textProperty().bind(textProperty);
			text.getStyleClass().add("edge-text");
			text.xProperty().bind(line.startXProperty().add(line.endXProperty()).divide(2).subtract(textWidth.divide(2)));
			text.yProperty().bind(line.startYProperty().add(line.endYProperty()).divide(2).subtract(textHeight.divide(2)));
			final Runnable recalculateWidth = () -> {
				textWidth.set(text.getLayoutBounds().getWidth());
				textHeight.set(text.getLayoutBounds().getHeight());
			};
			text.parentProperty().addListener((obs, oldVal, newVal) -> recalculateWidth.run());
			text.textProperty().addListener((obs, oldVal, newVal) -> recalculateWidth.run());
			group.getChildren().add(text);
			getChildren().add(group);
		}

		public Group getGroup() {
			return group;
		}

		public Line getLine() {
			return line;
		}

		public Text getText() {
			return text;
		}

	}

}