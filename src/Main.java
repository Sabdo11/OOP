public class Main {
    public static void  main(String [] args) {
        Tree myFavoriteOakTree = new Tree (25, 5, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree (25, 5, TreeType.MAPLE);

        if (myFavoriteOakTree.heightFt > 100) {
            System.out.print ("That's a tall");
        }
        if (myFavoriteMapleTree.heightFt > 100){
            System.out.print ("That's a tall tree");
        }
    }
}
