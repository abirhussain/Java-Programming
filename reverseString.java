class reverseString {
  public static void main(String[] args) {
    String str = "Hello World";
    int length = str.length();
    char tmp[] = str.toCharArray();
    str = "";
    for (int i = 0; i < length; i++) {
      str = str + tmp[length - (i + 1)];
    }
    System.out.println(str);
  }
}
