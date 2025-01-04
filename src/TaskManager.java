import java.util.*;

class TaskManager {
    List<List<Integer>> tasks;
    public TaskManager(List<List<Integer>> tasks) {
        this.tasks=new ArrayList<>(tasks);
        Comparator<List<Integer>> c = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                int x=l1.get(2) - l2.get(2);
                if(x==0){
                    return l1.get(1) - l2.get(1);
                }
                return x;
            }
        };

        Collections.sort(this.tasks,c);


    }

    public void add(int userId, int taskId, int priority) {
        this.tasks.add(new ArrayList<>());
        tasks.get(tasks.size()-1).add(userId);
        tasks.get(tasks.size()-1).add(taskId);
        tasks.get(tasks.size()-1).add(priority);
        Comparator<List<Integer>> c = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                int x=l1.get(2) - l2.get(2);
                if(x==0){
                    return l1.get(1) - l2.get(1);
                }
                return x;
            }
        };
        Collections.sort(tasks,c);
    }

    public void edit(int taskId, int newPriority) {
        for(int i=0; i<tasks.size();i++){
            if(tasks.get(i).get(1)==taskId){
                tasks.get(i).set(2,newPriority);
            }
        }
        Comparator<List<Integer>> c = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                int x=l1.get(2) - l2.get(2);
                if(x==0){
                    return l1.get(1) - l2.get(1);
                }
                return x;
            }
        };
        Collections.sort(this.tasks,c);
    }

    public void rmv(int taskId) {
        for(int i=0; i<this.tasks.size();i++){
            if(this.tasks.get(i).get(1)==taskId){
                this.tasks.remove(i);
            }
        }
        Comparator<List<Integer>> c = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                int x=l1.get(2) - l2.get(2);
                if(x==0){
                    return l1.get(1) - l2.get(1);
                }
                return x;
            }
        };
        Collections.sort(this.tasks,c);
    }

    public int execTop() {
        int x=this.tasks.get(tasks.size()-1).get(0);
        int y=this.tasks.get(tasks.size()-1).get(1);
        rmv(y);
        Comparator<List<Integer>> c = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                int x=l1.get(2) - l2.get(2);
                if(x==0){
                    return l1.get(1) - l2.get(1);
                }
                return x;
            }
        };
        Collections.sort(this.tasks,c);
        return x;
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(Arrays.asList(
                Arrays.asList(10, 26, 25)
        ));

        taskManager.rmv(26);  // Remove the task with taskId = 26
        System.out.println(taskManager.execTop());
    }
}

