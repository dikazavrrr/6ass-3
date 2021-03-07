public class MainVictorian {

	public static void main(String[] args) {
		Furniture furniture = new VictorianFurniture();
        Chair chair = furniture.getChair();
        Sofa sofa = furniture.getSofa();
        Coffee_Table coffee_table = furniture.getCoffeeTable();

        System.out.println("Victorian furniture \n");
        chair.createChair();
        sofa.createSofa();
        coffee_table.createCoffeeTable();
	}

}
