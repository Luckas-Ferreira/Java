package Q7;

public class FaceVideo extends Video {

    private final boolean[] bitsFace;

    public FaceVideo() {
       bitsFace = new boolean[] {
              false, true, false, true, false, false, false, false, false, true, true, false, false, false, false,
              true, false, true, true, true, false, false, true, false, false, true, true, false, false, false, false,
              true, false, true, true, false, false, false, true, false, true, true, true, false, true, false, false,
              true, false, true, true, false, true, true, true, false, false, true, true, true, false, false, true,
              true, false, false, true, false, true, true, false, false, false, false, true, false, false, false,
              false, false, false, true, true, true, false, true, true, false, false, true, true, false, false, false,
              true, true, false, false, true, false, false, false, false, false, false, true, true, false, false,
              false, true, true, false, true, true, false, true, true, true, true, false, true, true, false, true,
              true, true, false, false, true, true, true, false, false, true, true, false, true, true, false, false,
              true, false, true, false, true, true, false, false, true, true, true, false, true, true, true, false,
              true, false, true, false, true, true, false, true, false, false, true, false, true, true, true, false,
              true, false, true, false, false, true, false, true, true, true, false
       };
    }

    public boolean[] getBitsFace() {
        return bitsFace;
    }

    @Override
    public String getContent() {
        String bitStringAtual = "";
        String content = "";

        for(boolean bit : bitsFace){
            char bitAtual = bit ? '1' : '0';
            bitStringAtual += bitAtual;

            if(bitStringAtual.length() == 8){
                int valorAtual = Integer.parseInt(bitStringAtual, 2);
                content += (char)valorAtual;
                bitStringAtual = "";
            }
        }
        return content;
    }

}


    

