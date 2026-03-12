class DuplicateRemover{
    public static void main(String[] args) {
        String str = "programming";
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            if(sb.indexOf(String.valueOf(str.charAt(i))) == -1){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("The duplicate removed string is: "+ sb);
    }
}