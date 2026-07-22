
public class Main {

	public static void main(String[] args) {
		
		//ADD items by using menu.addItem(String,new MenuItem(String,double));
		//menu.printMenu; (Prints Menu) 
		RestaurantMenu menu = new RestaurantMenu();
		
		
		//Appetizers
        menu.addItem("Appetizers", new MenuItem("Caesar Salad", 4.99));
        menu.addItem("Appetizers", new MenuItem("Garlic Bread", 3.99));
        menu.addItem("Appetizers", new MenuItem("Sweet Potato Nacho Fries", 5.99));
        menu.addItem("Appetizers", new MenuItem("Buffalo Wings", 4.99));
        menu.addItem("Appetizers", new MenuItem("Breadsticks", 3.99));
        menu.addItem("Appetizers", new MenuItem("Onion Rings", 3.99));
        menu.addItem("Appetizers", new MenuItem("Nachos", 5.99));
        menu.addItem("Appetizers", new MenuItem("Soup Dumplings", 6.99));
        
        
        //Main Courses
        menu.addItem("Main Course", new MenuItem("Cheeseburger", 11.99));
        menu.addItem("Main Course", new MenuItem("Grilled Pizza", 10.99));
        menu.addItem("Main Course", new MenuItem("Chicken Alfredo", 12.99));
        menu.addItem("Main Course", new MenuItem("Fajita", 12.99));
        menu.addItem("Main Course", new MenuItem("Risotto", 12.99));
        menu.addItem("Main Course", new MenuItem("Beef Stew", 12.99));
        menu.addItem("Main Course", new MenuItem("Sweet Chili Chicken", 12.99));
        menu.addItem("Main Course", new MenuItem("Margherita Pizza", 12.99));
        
        
        //Desserts
        menu.addItem("Desserts", new MenuItem("Chocolate Cake", 7.99));
        menu.addItem("Desserts", new MenuItem("Apple Pie", 10.99));
        menu.addItem("Desserts", new MenuItem("Cheesecake", 12.99));
        menu.addItem("Desserts", new MenuItem("Peach Pie", 10.99));
        menu.addItem("Desserts", new MenuItem("Fruit Salad", 7.99));
        menu.addItem("Desserts", new MenuItem("Cheesecake", 6.99));
        menu.addItem("Desserts", new MenuItem("Red Velvet", 8.99));
        
        
		menu.printMenu();
	}

}
