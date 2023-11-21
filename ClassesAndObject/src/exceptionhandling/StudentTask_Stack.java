package exceptionhandling;
//writing own exception
class StackOverFlowException extends Exception{
    public String toString(){
        return "Stack is Full";
    }
}
class StackUnderFlowException extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}
class Stack{
    private int size;
    private int top=-1;
    private int[] s;

    public Stack(int sz){
       this.size=sz;
       s=new int[sz];
    }
    void push(int x )throws StackOverFlowException{
        if(top==size-1){
            throw new StackOverFlowException();
        }
        else {
            top++;
            s[top]=x;
        }
    }
    int pop()throws StackUnderFlowException{
        int x=-1;
        if(top==-1){
            throw new StackUnderFlowException();
        }else {
            x=s[top];
            x--;
        }
        return x;
    }

}
public class StudentTask_Stack {
    public static void main(String[] args) {
        Stack st=new Stack(5);
       /* try {
        st.push(5);//1
        st.push(10);//2
        st.push(20);//3
        st.push(33);//4
        st.push(45);//5
        st.push(90);//6 after 6th element push it will give message of own exception
        }catch (StackOverFlowException sof){
            System.out.println(sof);
        }*/
        try {
            st.pop();//we didn't push any element in stack it will give stack is empty exception
        }catch (StackUnderFlowException suf){
            System.out.println(suf);
        }


    }
}
