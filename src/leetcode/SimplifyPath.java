package leetcode.simplifyPath;

// Source : https://leetcode.com/problems/simplify-path/
// Author : Shen Bai
// Date   : 2018-05-30

import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 */

public class SimplifyPath {

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<String>();
        String[] parts = path.split("/");
        for (int i = 1; i < parts.length; i++) {
            String part = parts[i];
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        if (stack.empty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            String spath = stack.pop();
            sb.insert(0, "/");
            sb.insert(1, spath);
        }
        return sb.toString();
    }
}