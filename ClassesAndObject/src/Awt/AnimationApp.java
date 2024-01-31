package Awt;

import java.awt.*;

class MyAniApp extends Frame implements Runnable {

    //for bouncing a ball
    int x, y, tx, ty;//t ->transilation


    MyAniApp() {
        super("Animation");
        //initail coordinate
        x = 100;
        y = 100;
        tx = ty = 1;//increment both x and y

        //Run the Thread
        Thread t=new Thread(this);
        t.start();//start Threading

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, 50, 50);//x, y and width and height
    }

    @Override
    public void run() {

        //continously moving the ball
        //How? ->by adding x and y
        while (true) {

            x += tx;
            y += ty;
            if(x<0 || x>450){ //width of boundry(x)
                /*Therefore when we multiply a positive number by a negative number,
                 the answer is negative. As it doesn't matter which way round you multiply the numbers, we can also say that if we multiply a negative number by a positive number then the answer is negative.*/
                tx=tx*-1;    //tx 1 which is our current values that we assingned , tx=1*-1 result will be -1 , again if it's meet if statement tx=-1 ->tx=tx*-1 ->result will be -1*-1 =>1
            }
            //the reason for 20 is given in y the frame tittle bar is might have been 20px ,so it would be perfect if we give lessthatn 20px instead of 0px
            if(y<20 || y>350){ //because ball itself 50px width and height that's why we reduce that
                ty=ty*-1;
            }
            //redraw the complete frame
            repaint();//paint the ball again whenever it move and Bounce Back
            //sleep for while if not the painting ball will be very fast
            try{Thread.sleep(5);}catch (Exception e){}
        }
    }
}

public class AnimationApp {
    public static void main(String[] args) {

        MyAniApp m = new MyAniApp();
        m.setSize(500, 400);
        m.setVisible(true);
    }
}
