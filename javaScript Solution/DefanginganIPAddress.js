// 1108. Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/

var defangIPaddr = function(address) {
    return address.split(".").join("[.]")
    
};
