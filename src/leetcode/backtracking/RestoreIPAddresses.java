package leetcode.backtracking.restoreIPAddresses;

// Source : https://leetcode.com/problems/restore-ip-addresses/
// Author : Shen Bai
// Date   : 2018-06-19

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * Example:
 * Input: "25525511135"
 * Output: ["255.255.11.135", "255.255.111.35"]
 */

public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {

        List<String> list = new ArrayList<String>();
        if (s.length() == 0) {
            return list;
        }

        int start = 0;
        int seq = 0;
        List<StringBuilder> ip = new ArrayList<StringBuilder>();
        for (int i = 0; i < 4; i++) {
            StringBuilder sb = new StringBuilder();
            ip.add(sb);
        }

        _restoreIpAddresses(list, ip, start, seq, s);

        return list;
    }

    private void _restoreIpAddresses(List<String> list, List<StringBuilder> ip,
                                        int start, int seq, String s) {

        if (seq == 4) {
            return;
        }
        int len = s.length();
        int minLen = 4 - seq + start;
        int maxLen = (4 - seq) * 3 + start;
        if (len < minLen || len > maxLen) {
            return;
        }
        for (int i = start; i < len; i++) {
            char c = s.charAt(i);
            StringBuilder sb = ip.get(seq);
            sb.append(c);

            String str = sb.toString();
            int num = Integer.parseInt(str);
            if (num > 255) {
                return;
            }
            if (seq == 3 && i == s.length() - 1) {
                String ipStr = _buildIp(ip);
                list.add(ipStr);
            }
            if (seq < 3) {
                StringBuilder nextSb = ip.get(seq + 1);
                nextSb.delete(0, nextSb.length());
                _restoreIpAddresses(list, ip, i + 1, seq + 1, s);
            }
            if (num == 0) {
                break;
            }
        }
    }

    private String _buildIp(List<StringBuilder> ip) {
        StringBuilder newSb = new StringBuilder();
        newSb.append(ip.get(0).toString());
        newSb.append(".");
        newSb.append(ip.get(1).toString());
        newSb.append(".");
        newSb.append(ip.get(2).toString());
        newSb.append(".");
        newSb.append(ip.get(3).toString());

        return newSb.toString();
    }
}