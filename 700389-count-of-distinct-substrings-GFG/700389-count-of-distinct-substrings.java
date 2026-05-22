class Solution {
    static	class Node {
		
		Node[] node = new Node[26];
		boolean flag = false;
		
		boolean containsKey(char ch) {
			return node[ch - 'a'] != null;
		}
		
		Node get(char ch) {
			return node[ch - 'a'];
		}
		
		void put(char ch, Node newNode) {
			node[ch - 'a'] = newNode;
		}
		
	}
	

    public static int countSubs(String s) {
       
       int count = 0;
       Node root = new Node();
       for(int i = 0 ; i < s.length() ; i++){
           Node temp = root;
           for(int j = i ; j < s.length() ; j++){
               if(temp.containsKey(s.charAt(j))){
                   temp=temp.get(s.charAt(j));
               }
               else{
                   count++;
                   temp.put(s.charAt(j),new Node());
                   temp=temp.get(s.charAt(j));
               }
        
           }
       }
               return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna