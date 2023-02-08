package leetcode;

public class minRounds {

    public static int noOfTasks(int tasks[]){
        int min = Integer.MIN_VALUE;
        int task = 0; 
        for(int i = 0; i<tasks.length; i++){
            min = Math.max(min, tasks[i]); 
        }
        int count[] = new int[min+1]; 
        for(int i =0; i<tasks.length; i++){
            count[tasks[i]]++; 
        }
        for(int i=0; i<count.length; i++){
            System.out.print(count[i] + " ");
        }

        for(int i =0; i<count.length; i++){
           
            if(count[i] ==  1){
                return -1; 
            }
            else if(2 <= count[i] && count[i] <= 3){
                task = task+1; 
            }
            else if(count[i] > 3){
                task = task+2; 
                // count[i] = count[i] - 3; 
            }
        }
       
        return task; 

    }
    public static void main(String[] args) {
        int tasks[] = {2,2,3,3,2,4,4,4,4,4}; 
        System.out.println(noOfTasks(tasks));
    }
}
