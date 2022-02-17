public class Main {
    public static void  main(String [] args) {
        Tree myFavoriteOakTree = new Tree (120, 12, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree (180, 30, TreeType.MAPLE);
        Tree myFavoriteWalnutTree = new Tree (150, 18, TreeType.WALNUT);

        System.out.print ( myFavoriteOakTree.getTreeType ());
        System.out.print ( myFavoriteOakTree.getHeightFt ());
        System.out.print ( myFavoriteOakTree.getTrunkDiameterInches ());


        myFavoriteOakTree.grow();

    }
}
