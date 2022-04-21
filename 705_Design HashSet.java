// https://leetcode.com/problems/design-hashset/
// 705. Design HashSet
class MyHashSet {
  boolean bool[]=new boolean[1000001];
    public MyHashSet() {
       
    }
    
    public void add(int key) {
        bool[key]=true;
    }
    
    public void remove(int key) {
        bool[key]=false;
    }
    
    public boolean contains(int key) {
        return bool[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
