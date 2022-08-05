public class Area_of_shapes {

    float calculateArea(float a, float b){

        float pi=a , radius=b, area=pi*radius*radius;
        return area;
    }

    float calculateArea(float a, float b, float c){

        float height= a, base=b, divisor=c, area=(height*base)/divisor;
        return area;
    }

    float calculateArea(double a, float b){

        float length = (float)a, width= b, area = width*length;
        return area;
    }
}
