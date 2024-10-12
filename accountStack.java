
import java.util.ArrayList;
import java.util.EmptyStackException;

public class accountStack <T>
{
    private ArrayList<T> stack;

    public accountStack(){
        stack = new ArrayList();
    }
    public void push(T a){
        stack.add(a);
    }
    public T pop(){
        if(stack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }else{
            return stack.remove(stack.size()-1);
        }

    }
    public T peek(){
        if (stack.isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        return stack.get(stack.size()-1);

    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }


    public void writeToFile(String filename) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(filename))) {
            for (T item : stack) {
                writer.println(item);
            }
        } catch (java.io.IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
