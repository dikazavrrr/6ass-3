public class VictorianFurniture implements Furniture {
	@Override
    public Chair getChair() {
        return new VictorianChair();
    }
	
	@Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }

    @Override
    public Coffee_Table getCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
