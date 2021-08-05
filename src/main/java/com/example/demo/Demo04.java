package com.example.demo;

/**
 * @atuthor: mac
 * Create:  2020-03-12  18:50
 * Email: wangbo@unicloud.com
 */
public class Demo04 {

    public static void main(String[] args) {
        System.out.println(isInRange("192.168.1.127", "192.168.1.64/26"));
        //System.out.println(isInRange("192.168.1.2", "192.168.0.0/23"));
        //System.out.println(isInRange("192.168.0.1", "192.168.0.0/24"));
        //System.out.println(isInRange("192.168.0.0", "192.168.0.0/32"));
    }
    public static boolean isInRange(String ip, String cidr) {
        String[] ips = ip.split("\\.");
        int ipAddr = (Integer.parseInt(ips[0]) << 24)
                | (Integer.parseInt(ips[1]) << 16)
                | (Integer.parseInt(ips[2]) << 8) | Integer.parseInt(ips[3]);
        System.out.println(Integer.parseInt(ips[0]) << 24);
        int type = Integer.parseInt(cidr.replaceAll(".*/", ""));
        //System.out.println(cidr.replaceAll(".*/", ""));
        //System.out.println(cidr);
        int mask = 0xFFFFFFFF << (32 - type);
        System.out.println(mask);
        String cidrIp = cidr.replaceAll("/.*", "");
        System.out.println();
        String[] cidrIps = cidrIp.split("\\.");
        int cidrIpAddr = (Integer.parseInt(cidrIps[0]) << 24)
                | (Integer.parseInt(cidrIps[1]) << 16)
                | (Integer.parseInt(cidrIps[2]) << 8)
                | Integer.parseInt(cidrIps[3]);

        return (ipAddr & mask) == (cidrIpAddr & mask);
    }

}
