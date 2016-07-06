package objectdependencyinjection;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

//    private Point pointA, pointB, pointC;
//
//    public Point getPointA() {
//        return pointA;
//    }
//
//    public void setPointA(Point pointA) {
//        this.pointA = pointA;
//    }
//
//    public Point getPointB() {
//        return pointB;
//    }
//
//    public void setPointB(Point pointB) {
//        this.pointB = pointB;
//    }
//
//    public Point getPointC() {
//        return pointC;
//    }
//
//    public void setPointC(Point pointC) {
//        this.pointC = pointC;
//    }
    
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    public void draw() {
//        System.out.println("X: " + getPointA().getX() + " Y: " + getPointA().getY());
//        System.out.println("X: " + getPointB().getX() + " Y: " + getPointB().getY());
//        System.out.println("X: " + getPointC().getX() + " Y: " + getPointC().getY());

        for (Point point : points) {
            System.out.println("X: " + point.getX() + " Y: " + point.getY());
        }
    } // end method draw()

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBeanName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} // end class Triangle