import java.awt.*;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
   protected static  Color TRUNK_COLOR = new Color (120, 51,0);

    // Constructor
    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;

    }

    public double getHeightFt() {
        return heightFt;
    }
    public double getTrunkDiameterInches(){
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType(){
        return treeType;
    }

    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;

    }
    static void announceTree(){
        System.out.print ("look out for that " + TRUNK_COLOR + " tree! " );
    }


   public void announceTalltree() {
        if (this.heightFt > 100) {
            System.out.print ("That's a tall " + this.treeType + " tree! ");
        }
    }
}
