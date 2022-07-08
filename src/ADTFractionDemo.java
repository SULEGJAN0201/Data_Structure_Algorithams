public class ADTFractionDemo {
    public static void main(String[] args) {
                    ADTFraction f1 = new ADTFraction();
                    f1.display();
                    f1.set(12,30);
                    f1.display();
                    ADTFraction f2=new ADTFraction(3,7);
                    f2.display();
                    f1.plus(f2).display();
                    ADTFraction f3= f1.plus(f2);
                    f3.display();
                    f3.refine();
                    f3.display();
                    f3.reciprocal();
                    f3.display();
                    f3.times(2).display();


    }
}

class ADTFraction {
    private int n; //numerator
    private int d; //denominator

    public ADTFraction() {
        this.n=0;
        this.d=1; //denominator can't be zero
    }
    //---------------------------------------------------
    public ADTFraction(int a, int b) {//parameter constructor
        if (b!=0) {
            this.n = a;
            this.d = b;
        }
        else {
            this.n=0;
            this.d=1;
            System.out.println("denominator can't not be zero");
        }
        // otherwise we use set(a,b)
    }
    //---------------------------------------------------
    public void set(int a, int b) {//set numerator and denomenator
        if (b!=0) {
            this.n = a;
            this.d = b;
        }
        else {
            this.n=0;
            this.d=1;
            System.out.println("denominator can't not be zero");
        }
    }
    //---------------------------------------------------
    public ADTFraction plus(ADTFraction x) {//add two fractions
          int num,den,max;
          if(this.d>x.d){
              max=this.d;
          }else{
              max=x.d;
          }
          int comDen=max;
          while (true) {
              if (comDen % this.d == 0 && comDen % x.d == 0) {
                    break;
              } else {
                  comDen = comDen + max;
              }
          }
          num = (comDen/this.d) * this.n + (comDen/x.d) * x.n;
          den = comDen;
          ADTFraction ans = new ADTFraction(num,den);
          return ans;
          // return = new ADTFraction(num,den);
    }
    //this method we are passing other object of the same class.
    //---------------------------------------------------

    public ADTFraction times(int a) {//multiply fraction by a number
           int num,den;
           num=this.n*a;
           den=this.d;
           return new ADTFraction(num,den);
    }
    //---------------------------------------------------

    public ADTFraction times(ADTFraction x) {//multiply two fractions
        int num,den;
        num = this.n * x.n;
        den = this.d * x.d;
        return new ADTFraction(num,den);
    }
    //---------------------------------------------------
    public ADTFraction reciprocal() {//reciprocal of a fraction
           return new ADTFraction(this.d,this.n);
    }
    //---------------------------------------------------
    public float value() {//numerical value of a fraction
           float value = (float) this.n/this.d;
           return value;
    }
    //---------------------------------------------------
    public void display() {//display the fraction in the format n/d
        System.out.println("Fraction = " + this.n + "/" + this.d);
    }
    //---------------------------------------------------

    public void refine() {//set the instance to its minimum fraction
        int min ;
     if (this.n < this.d){
              min=this.n;
     }
     else{
         min = this.d;
     }
     for (int i=min;i>=2;i--){
         if (this.n % i==0 && this.d % i==0){
             this.n=this.n/i;
             this.d=this.d/i;
         }
     }
    // For instance, if this fraction is 12/30, change it to 2/5.
    }
}