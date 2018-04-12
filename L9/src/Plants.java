public class Plants {
	private Type type;
	private Color color;
	private int size;
	
	public enum Color {White, Red, Blue}
	public enum Type {Rose, Violet, Iris}
	
	


	public Plants(String type, String color, int size) throws ColorException, TypeException{
		      Color c = colorStrToEnum(color);
		      Type t = typeStrToEnum(type);
		      this.size = size;
		      this.type = t;
		      this.color = c;
		   }

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("Input only color blue, red or white");
		}
	}
	
	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.Rose;
		case "violet":
			return Type.Violet;
		case "iris":
			return Type.Iris;
		default:
			throw new TypeException("Input only type Rose, Violet, Iris");
		}
	}

	@Override
	public String toString() {
		return "Plant is " + type +
                ", color is " + color + ", size is " + size;
    }
	}


