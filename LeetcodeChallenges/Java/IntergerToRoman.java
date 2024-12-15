// import java.util.HashMap;
// import java.util.Map;
// import java.lang.Math;

// public class IntergerToRoman {
//     private String reString;
//     private int leftNum;
//     private HashMap<Integer, Character> dictHashMap;

//     public IntergerToRoman() {
//         reString = "";
//         dictHashMap = new HashMap<>();
//         dictHashMap.put(1, 'I');
//         dictHashMap.put(5, 'V');
//         dictHashMap.put(10, 'X');
//         dictHashMap.put(50, 'L');
//         dictHashMap.put(100, 'C');
//         dictHashMap.put(500, 'D');
//         dictHashMap.put(1000, 'M');
//     }

//     public String intToRoman(int num) {
//         leftNum = num;
//         // Convert to string so that u can get the number rounded to the nearest thousand/hundred
//         double log = Math.log10(num);
//         Character[] numString = num.toCharArray();

//         for (int i = 0; i < numString.length; i++) {
            



//             if (numString[i] == 4 || numString[i] == 9) {

//             } else {
                
//             }
//         }
        
        

//         return reString;
//     }

//     /*
//      * If the value does not start with 4 or 9, 
//      * select the symbol of the maximal value that 
//      * can be subtracted from the input, append 
//      * that symbol to the result, subtract its value, 
//      * and convert the remainder to a Roman numeral.
//      * 
//      * 
//      * Aditionally I assume that the number is already rounded
//      * to the nearest thousand, hundred etc.
//      */
//     private void maximumStringWithout4Or9(int num, int powerOfTen) {
//         if(dicHashMap.containsKey(powerOfTen)) {
//             if (num == 5) {
//                 dicHashMap.get(powerOfTen);
//             }
//         }
        
//     }
    
//     private void maximumStringWith4Or9(int num) {
        
//     }

//     public static void main(String[] args) {
//         IntergerToRoman object = new IntergerToRoman();
//         object.intToRoman(1000);

//     }
// }
