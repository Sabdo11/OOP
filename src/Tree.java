import java.awt.*;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static  Color TRUNK_COLOR = new Color (120, 51,0);

    // Constructor
    Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;

    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;

    }
    static void announceTree(){
        System.out.print ("look out for that " + TRUNK_COLOR + " tree!");
    }


    void announceTalltree() {
        if (this.heightFt > 100) {
            System.out.print ("That's a tall " + this.treeType + " tree! ");
        }
    }
}
