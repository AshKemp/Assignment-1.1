public class AddWithoutPlus {
	public static void main(String args[]){
		System.out.println("Sum is "+add(7,8));
        }

public static int add(int a,int b){
    if(b==0){
       return a;
    }
    int sum=a^b;
    int carry = (a&b) << 1;
    return add(sum,carry);
}
}	