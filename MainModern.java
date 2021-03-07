public class MainModern {

	public static void main(String[] args) {
		Furniture furniture = new ModernFurniture();
        Chair chair = furniture.getChair();
        Sofa sofa = furniture.getSofa();
        Coffee_Table coffee_table = furniture.getCoffeeTable();

        System.out.println("Modern furniture \n");
        chair.createChair();
        sofa.createSofa();
        coffee_table.createCoffeeTable();
	}

}
