class Solution {
    public int reverse(int x) {

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse(); // StringBuilder 만들고 뒤집기

        if(String.valueOf(x).charAt(0) == '-') {
          sb.deleteCharAt(sb.length() - 1); // 마지막 - 삭제
          sb.insert(0,'-'); // 맨 처음에 - 삽입
        }

        long parsedLong = Long.parseLong(sb.toString());
        if(parsedLong > 2147483647 || parsedLong < -2147483647){
          return 0;
        }

        return Integer.parseInt(sb.toString());
    }
}