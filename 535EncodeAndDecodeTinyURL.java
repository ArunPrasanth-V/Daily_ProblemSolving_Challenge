// https://leetcode.com/problems/encode-and-decode-tinyurl/
// 535. Encode and Decode TinyURL
public class Codec {

    HashMap<String,String> map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
         String url="http://Arun"+map.size();
          map.put(url,longUrl);
        return url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
       
        return  map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
