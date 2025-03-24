class CommandLineDemo2 {
    public static void main(String args[]) {
        // Check if the correct number of arguments is provided
        if (args.length < 3) {
            System.out.println("Please provide at least three arguments: Name, Rno, and Dept.");
            return;
        }

        String s1 = args[0]; 
        String s2 = args[1]; 
        String s3 = args[2]; 

        System.out.println("Name: " + s1);
        System.out.println("Rno: " + s2);
        System.out.println("Dept: " + s3);
    }
}
