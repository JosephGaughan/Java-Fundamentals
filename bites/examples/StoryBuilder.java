package bites.examples;

public class StoryBuilder {

    String plot = "";

    public void addPlotline(String plotline) {
        plot = plot + plotline;
    }

    public String getPlot() {
        return plot;
    }

    public static void main(String[] args) {
        StoryBuilder storyBuilder = new StoryBuilder();
        String plotline = "Then he ran away.";
        storyBuilder.addPlotline(plotline);
        System.out.println("Final plot: " + storyBuilder.getPlot());
    }

}
