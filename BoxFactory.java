// BoxFactory.java
// D. Singletary 
// 9/2/22
// Class which represents a factory containing boxes of various colors

public class BoxFactory {

    public static final int NUMBER_OF_BOXES = 3;
    
    private Box box1, box2, box3;
    
    public BoxFactory() { }
    
    public static void main(String[] args) {
    
        // create our Box factory
        BoxFactory boxFact = new BoxFactory();
        
        // instantiate local boxes
        Box box1 = new Box(Color.RED);
        Box box2 = new Box(Color.GREEN);
        Box box3 = new Box(Color.BLUE);
        
        // add the boxes to the factory
        boxFact.box1 = box1;
        boxFact.box2 = box2;
        boxFact.box3 = box3;
        
        // Use the toString method to print box state (color)
        System.out.println("Box Factory contents:");
        System.out.println("First Box is a " + boxFact.box1 + " box.");
        System.out.println("Second Box is a " + boxFact.box2 + " box.");
        System.out.println("And the final box is a " + 
                            boxFact.box3 + " box.");
    }
}

// class to represent color values
class Color {

    // constant int representation
    public static final int NO_COLOR = 0;
    public static final int RED = 1;
    public static final int GREEN = 2;
    public static final int BLUE = 3;
    
    // constant String representation
    public static final String STR_NO_COLOR = "NO COLOR";
    public static final String STR_RED = "RED";
    public static final String STR_GREEN = "GREEN";
    public static final String STR_BLUE = "BLUE";
    
    // convert the int representation to String
    public static String colorToString(int color) {
    
        // return value defaults to no color
        String returnStr = STR_NO_COLOR;
        
        if (color == RED)
            returnStr  = STR_RED;
        else if (color == GREEN)
            returnStr = STR_GREEN;
        else if (color == BLUE)
            returnStr = STR_BLUE; 
        
        return returnStr;
    }
}

// class which represents s box
class Box {

    // color is the only attribute
    private int boxColor = Color.NO_COLOR;

    // default constructor
    public Box() { }
    
    // overloaded constructor which accepts a color parameter
    public Box(int color) {
        boxColor = color;
    }
    
    // toString returns String representation of object.
    // it is inherited from the Object class,
    // we are overriding its default behavior here
    @Override
    public String toString() {
        return Color.colorToString(boxColor);
    }
}
    