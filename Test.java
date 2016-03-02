package nsd.jp.co;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Stack;

//import jp.co.tepco.kpfbpf.livesite.common.webapp.validator.character.MDCharChecker;

public class Test {

    public static void main(String[] args) {
//        // TODO 自動生成されたメソッド・スタブ
//        StringBuilder birthdayBuild = new StringBuilder(0);
//        birthdayBuild.append("20");
//        System.out.println(birthdayBuild);
//        
//        String a = "112";
//        String b = new String("111");
//        String c = b.intern();
//        System.out.println(a==c);
//        System.out.println(c==b);
//        System.out.println(c);
        
//        String str1 = "Iam";
//        String str2 = "Iam";
//
//        String str3 = "Iam".intern();
//        System.out.println(str3 == str1);
//        
//        str1 += "love"+"java";       // 1)
//
//        str2 = "love".intern()+"love"+"java";      //2)
//        
//        
//        
//        AlarmDoor www = new AlarmDoor2() {
//            
//            @Override
//            void open() {
//                // TODO 自動生成されたメソッド・スタブ
//                
//            }
//            
//            @Override
//            void close() {
//                // TODO 自動生成されたメソッド・スタブ
//                
//            }
//            
//            public int alarm() {
//                return 22;
//
//            }
//        };
//        
//        AlarmDoor4 d4 = new AlarmDoor4() {
//        };
//        
//        
//        int k = www.alarm();
//        
//        System.out.println(d4.getint());
//        
//    }
        
        
        
//        for (int i : nums) {
//            System.out.println(i);
//        }
//        
//        moveZeroes(nums);
//        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//        for (int i : nums) {
//            System.out.println(i);
//        }
//        System.out.println(isAlphanumeric("1aAﾅ "));
        
//        isAnagram("anagram", "nagaram");
//        
//        System.out.println(containsDuplicate(nums));
//        
//        System.out.println("(((((((((((((((((((((((((((((((((");
//        
//        System.out.println(titleToNumber("CBA"));
        
//        System.out.println(majorityElement(nums));
        
        
//        System.out.println(hammingWeight(255));
        
//        System.out.println(climbStairs(21));
        
//        System.out.println(isUgly(255));
        
//        System.out.println(isHappy(18));
        
//        System.out.println(isPowerOfThree(27));
        
//        System.out.println(isPowerOfTwo(1073741823));
        
//        System.out.println(String.format("%02d", Integer.valueOf(2)));
        
//        System.out.println(removeElement(nums,2));
        
//        System.out.println(removeDuplicates(nums));
        
//        System.out.println(generate(5));
//        String a = "12345678";
//        System.out.println(a.charAt(4));
        
//        System.out.println(trailingZeroes(9));
        
//        System.out.println(getRow(8));
        
//        merge(nums,nums.length,nums2,nums2.length);
        
//        System.out.println(isValidSudoku(null));
        
        int[] num1 = { 15, 1, 3, 7, 2, 15, 17 };

        int[] num2 = { 0, 2, 4, 6, 8, 13 };
        
//        System.out.println(containsNearbyDuplicate(num1,4));
        
//        System.out.println(reverseBits(43261596));
//        System.out.println(reverseBits(3));
//        System.out.println(3<<1 | 1&1);
//        System.out.println(-43261596>>>20);
//        System.out.println(1l<<62);
        
        Locale locale1 = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("ttt",locale1);
        System.out.println(bundle.getString("name"));
        
        Locale locale2 = new Locale("ja", "JP");
        ResourceBundle bundle2 = ResourceBundle.getBundle("ttt",Locale.getDefault());
        System.out.println(bundle2.getString("name"));
        
        Locale locale3 = new Locale("zh", "CN");
        ResourceBundle bundle3 = ResourceBundle.getBundle("ttt",locale3);
        System.out.println(bundle3.getString("name"));
        
        
//        System.out.println(lengthOfLastWord("Hello World "));
//        
//        String a = "1234R";
//        System.out.println('R'== a.charAt(4));
        
//        for (int e : num1) {
//            System.out.println(e);
//        }
        
        
        
}
    
    public static int lengthOfLastWord(String s) {
//        String[] target = s.trim().split(" ");
//        return target[target.length - 1].length();
        return s.trim().length()-1-s.trim().lastIndexOf(" ");
    }

//    public static int reverseBits(int n) {
//        int res = 0;
//        for (int i=0;i<32;i++,n>>=1) {
//            res = res<<1 | (n&1);
//        }
//        return res;
//        
////        return Integer.reverse(n);
//    }
    
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
//        // Short HashSet Solution
//        HashSet<Integer> hs = new HashSet<Integer>();
//        for (int i=0;i<nums.length;i++) {
//            if(!hs.add(nums[i])) return true;
//            if (hs.size()==k+1) hs.remove(nums[i-k]);
//        }
//        return false;
        
//        // Java 5 lines O(n) solution using HashMap
//        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        
//        for (int i=0;i<nums.length;i++) {
//            if (hm.containsKey(nums[i])) {
//                return true;
//            }
//            hm.put(nums[i], i);
//        }
//        return false;
        

//        // 私
//        for (int i = 0; i < nums.length; i++) {
//            hs.add(nums[i]);
//            for (int j = 0; j <= k; j++) {
//                if (i + j < nums.length && i != i + j && nums[i] == nums[i + j]) {
//                    System.out.println("22222 :" + nums[i]);
//                    return true;
//                }
//            }
//            System.out.println("33333 :" + nums[i]);
//        }
//        return false;
//    }
    
//    public static boolean isValidSudoku(char[][] board) {
//
//        if (board.length !=9){
//            return false;
//        } else {
//            for (char[] arrchar : board) {
//                if (arrchar.length !=9){
//                    return false;
//                }
//                int yoko = 0;
//                for (char c : arrchar) {
//                    yoko+=Integer.valueOf(c);
//                } if (yoko!=45) {
//                    return false;
//                }
//            }
//            for (int i=0;i<9;i++) {
//                
//            }
//            
//            
//        }
//        return true;
//    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        
//        nums1 = Arrays.copyOf(nums1, m);
//        nums2 = Arrays.copyOf(nums2, n);
//        
//        Arrays.asList(nums1,1);
//        Arrays.sort(nums1);
//        for (int i=0;i<nums1.length;i++) {
//            System.out.println(nums1[i]);
//        }
//        
//        return;
//    }

//    public static List<Integer> getRow(int rowIndex) {
//        List<Integer> ret = new ArrayList<Integer>();
//        if (rowIndex == 0) {
//            return ret;
//        } else if (rowIndex == 1) {
//            ret.add(1);
//            return ret;
//        } else {
//            ret.add(1);
//            int i = 1;
//            while (i<rowIndex) {
//                int n = 1;
//                for (int j=1;j<ret.size();j++) {
//                    int temp = ret.get(j);
//                    ret.set(j,temp+n);
//                    n = temp;
//                }
//                ret.add(1);
//                i++;
//            }
//        }
//        
//        for (int j=0;j<ret.size();j++) {
//            System.out.println(ret.get(j));
//        }
//        
//        return ret;
//    }
//    public static int trailingZeroes(int n) {
//
//        int sum = 1;
//        int tot = 0;
//        for (int i= 2;i<=n;i++) {
//            sum*=i;
//        }
//        System.out.println(sum);
//        while (sum%10==0) {
//            sum/=10;
//            tot++;
//        }
//            
//        return tot;
//    }

//    public static List<List<Integer>> generate(int numRows) {
//
//        List<List<Integer>> lst = new ArrayList<List<Integer>>();
//        List<Integer> lst1 = new ArrayList<Integer>();
//        for (int i=0;i<numRows;i++) {
//            List<Integer> lst2 = new ArrayList<Integer>();
//            for (int j=0;j<i+1;j++) {
//                if (j==0 || j==i) {
//                    lst2.add(1);
//                } else {
//                    if (lst1.size() != 0) {
//                        lst2.add(lst1.get(j-1) + lst1.get(j));
//                    }
//                }
//                System.out.print(lst2.get(j)+", ");
//                
//            }
//            lst1 = lst2;
//            lst.add(lst2);
//            System.out.println();
//        }
//        
//        return lst;
//    }

//    public static int removeDuplicates(int[] nums) {
//
//        Set<Integer> set = new HashSet<Integer>();
//        for (Integer aaa:nums) {
//            set.add(aaa);
//        }
//        return set.size();
//    }

//    public static int removeElement(int[] nums, int val) {
//        int index = 0;
//        for(int i : nums) 
//            if(i != val) 
//                nums[index++] = i;
//        System.out.println(nums.length);
//        return index;
//    }
//    public static int removeElement(int[] nums, int val) {
//        System.out.println(nums.length);
//        ArrayList<Integer> lst = new ArrayList<Integer>();
////        for (int i=0;i<nums.length;i++) {
////            if (nums[i] != val) {
////                lst.add(nums[i]);
////            }
////        }
//        Arrays.copyOf(nums, 0);
//        lst.remove(val);
//        return lst.size();
//    }
//    public static boolean isPowerOfTwo(int n) {
//
////        double n1=n;
////        do {
////            n1/=2;
////        } while(n1%2==0);
////        System.out.println(n1);
////        return n1==1;
//        
////        return n>0 && 1073741824 % n==0; 
//        
//        return n>0 && (n&n-1) == 0;
//    }


//    public static boolean isPowerOfThree(int n) {
//        // 1162261467 is 3^19,  3^20 is bigger than int  
//        return ( n>0 &&  1162261467%n==0);
//    }
    
//    public static boolean isHappy(int n) {
//        int value = n;
//        String strVal;
//        do {
//            strVal = Integer.toString(value);
//            value = 0;
//            for (int i = 0; i < strVal.length(); i++) {
//                value += Math.pow(strVal.charAt(i) - '0', 2);
//            }
//            System.out.println(value);
//        } while (value > 9);
//
//        return value == 1;
//    }
    
    
//    public static boolean isHappy(int n) {
//        int count=0;
//        int n1= n;
//        
//        while (n/10!=0) {
//            while(n1/10!=0){
//                n1=n1/10;
//                count++;
//            }
//            n = endlessly(n, count);
//        }
//        System.out.println(n);    
//        return n==1;
//    }
//    public static int endlessly(int n,int count) {
//        int n_new=(int)Math.pow(n%10, 2); 
//        for (int i=1;i<=count;i++) {
//            n_new+=(int)Math.pow((n/(10*i))%10, 2);
//        }
//        return n_new;
//    }
//    public static boolean isUgly(int num) {
//
//        while (num%2==0) 
//            num=num/2;
//        while (num%3==0) 
//            num=num/3;
//        while (num%5==0) 
//            num=num/5;
//        System.out.println(num);
//        return num==1;
//    }
//    public static int climbStairs(int n) {
//
//        return n;
//    }

//    public static int hammingWeight(int n) {
//        String integer = Integer.toBinaryString(n);
//        integer = integer.replaceAll("0","");
//        return integer.length();
//    }
    // 私
 // you need to treat n as an unsigned value
//    public static int hammingWeight(int n) {
//        char[] aaa = Integer.toBinaryString(n).toCharArray();
//        int count = 0;
//        for (char target : aaa) {
//            if ('1' == target) {
//                count++;
//            }
//        }
//        
//        System.out.println(aaa);
//      return Integer.bitCount(n);
////        return count;
//
//    }
//    
    
    public int romanToInt(String s) {
        Map<Character,Integer> values = new HashMap<Character,Integer>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        
        
        return 1;
    }
    
    
    
    
//    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    
    public static ListNode reverseList(ListNode head) {

        if(head!=null){
            Stack<ListNode> stack = new Stack<ListNode>();
            ListNode node = head;
            ListNode tempNode;
            stack.push(node);
            while (node!= null) {
                if(node.next==null){
                    break;
                }
                stack.push(node.next);
                node = node.next;
            }
            //栈中的数据重新组成单链表
            tempNode = stack.pop();
            ListNode node1 = tempNode;
            ListNode headNew = tempNode;
            while(node1!=head){
                node1 = stack.peek();
                tempNode.next = stack.pop();
                tempNode = node1;
            }
            node1.next = null;
            return headNew;
            }else
            return null;

    }
    
    public static int majorityElement(int[] nums) {

        Set<Integer> target = new HashSet<Integer>();
        for (int a:nums) {
            target.add(a);
        }
        if (target.size()-1>nums.length/2) {
            System.out.println("1111111");
            return -1;
        } 
        for (int b:target) {
            
            int count = 0;
            for (int i=0;i<nums.length;i++) {
                if (b == nums[i])
                    count++;
            }
            if (count>=nums.length/2) {
                System.out.println("22222222222222222222");
                return 1;
            }
        }
        return -1;
    }
    // 私
//    public static int titleToNumber(String s) {
//
//        int result = 0;
//        int b = 0;
//        char[] target = s.toCharArray();
//        for (int i=target.length-1;i>=0;i--) {
//            if (i==target.length-1) {
//                result = target[i]-64;
//            } else
//            result = result + (b * 26) * (target[i]-64);
//            b++;
//        }
//        return result;
//    }
    
    public static int titleToNumber(String s) {

        int ans = 0;
        int b = 0;

        for(int i=s.length()-1; i>=0; i--){
            int n = (int)s.charAt(i)-64 ;
            ans += n * Math.pow(26,b);
            b++;
        }

        return ans;
    }

    
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> target = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++) {
            target.add(nums[i]);
        }
         
        return target.size() == nums.length;
    }
    
    public static boolean isAnagram(String s, String t) {
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();
        if(arr1.length != arr2.length){
            return false;
        }
        int[] record = new int['z'+1];
        for(int i =0; i< arr1.length; i++){
            record[arr1[i]]++;
        }

        for(int j = 0; j< arr2.length; j++){
            record[arr2[j]]--;
        }

        for(int a : record){
            if(a!=0){
                return false;
            }
        }
        return true;
    }
    
    public static void moveZeroes(int[] nums) {

        int mark = 0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i]!=0) {
                nums[mark++] = nums[i];
            }
        }
        for(; mark<nums.length; mark++) {
            nums[mark] = 0;
        }
    }
    
    
//    protected static boolean isAlphanumeric(String str) {
//        for (int i = 0; i < str.length(); ++i)
//            if ((!(isDigit(str.charAt(i)))) && (!(isLetter(str.charAt(i))))) {
//                if (MDCharChecker.isSingleByteKatakana(str.charAt(i))) {
//                    System.out.println("22222222222222222222222");
//                    continue;
//                }
//                return false;
//            }
//        System.out.println("333333333333333333333333333");
//        return true;
//    }
    
    protected static boolean isDigit(char ch)
    {
      return ((ch >= '0') && (ch <= '9'));
    }
    
    protected static boolean isLetter(char ch)
    {
      return (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')));
    }
    
    
    public static boolean isSingleByteKatakana(char c) {
      return true;
    }
    
    
    

abstract class AlarmDoor extends Door implements Alarm {

    @Override
    public int alarm() {
        return 1;

    }
    abstract void open();
    
    abstract void close();
}

interface Alarm {
    int alarm();
}

abstract class Door {
    abstract void open();

    abstract void close();
}


class AlarmDoor2 extends AlarmDoor {

    @Override
    void open() {
        // TODO 自動生成されたメソッド・スタブ
        
    }

    @Override
    void close() {
        // TODO 自動生成されたメソッド・スタブ
        
    }
    
}

class AlarmDoor3 extends AlarmDoor2 {
}


abstract class AlarmDoor4 {
    int getint() {
        return 33;
    }
}
}
