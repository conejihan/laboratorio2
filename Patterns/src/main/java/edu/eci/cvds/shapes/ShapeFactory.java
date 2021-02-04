package edu.eci.cvds.shapes;
import edu.eci.cvds.shapes.concrete.Triangle;
import edu.eci.cvds.shapes.concrete.Quadrilateral;
import edu.eci.cvds.shapes.concrete.Pentagon;
import edu.eci.cvds.shapes.concrete.Hexagon;

	public class ShapeFactory{
		
		public static Shape create(RegularShapeType type){
			switch (type){
				case Triangle:
					Triangle t = new Triangle();
					return t;
					
				case Quadrilateral:
					Quadrilateral q = new Quadrilateral();
					return q;
				case Pentagon:
					Pentagon p = new Pentagon();
					return p;
				case Hexagon:
					Hexagon h = new Hexagon();
					return h;
				
			}
			return null;
	}
	}