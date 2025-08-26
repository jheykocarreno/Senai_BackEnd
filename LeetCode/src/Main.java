import ListNode.ListNode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("------------------ LEETCODE ------------------");
            System.out.println("0. Sair!!!");
            System.out.println("1. Two Sum");

            option = sc.nextInt();

            if (option == 0) {
                System.out.println("Obrigado!!!! Tchau");
                break;
            } else if (option == 1){
                int[] nums = {1,2,5,9,8,6};
                int target=15;

                int[] result = twoSum(nums, target);
                System.out.println(result[0]);
                System.out.println(result[1]);
                break;
            } else if (option ==2){
                ListNode l1 = new ListNode(243);
                ListNode l2 = new ListNode(564);

                addTwoNumbers(l1, l2);
            }
            else {
                System.out.println("Digite novamente a Opcão: ");
            }
        } while (option != 0);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] volver = new int[2];

        for (int i=0; i < nums.length; i++)
        {
            for (int j=1; j < nums.length; j++)
            {
                if (target == nums[i] + nums[j]){
                    volver[0]=(i);
                    volver[1]=(j);
                }
            }
        }
        return volver;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){ {

        System.out.println(l1);


    }
}