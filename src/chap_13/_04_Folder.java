package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
        }

        folderName = "A/B/C";
        // "A" + File.separator + "B" + File.separator + "C"

        // 윈도우 : C:\\Users\\김태훈\\Desktop
        // 맥 : /Users/김태훈/Desktop

        folder = new File(folderName);
        // folder.mkdir();
        folder.mkdirs();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
