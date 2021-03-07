public class ModernFurniture implements Furniture {
	@Override
    public Chair getChair() {
        return new ModerChair();
    }
	
	@Override
    public Sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public Coffee_Table getCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
