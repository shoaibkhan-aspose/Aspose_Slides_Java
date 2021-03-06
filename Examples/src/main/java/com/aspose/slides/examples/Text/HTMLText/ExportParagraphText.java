/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Text.HTMLText;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ExportParagraphText
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportParagraphText.class);

        //Load the Presentation1 file
        Presentation pres = new Presentation(dataDir+ "input.pptx");

        //Acesss the default first slide of Presentation1
        ISlide slide = pres.getSlides().get_Item(0);

        //Desired index
        int index=0;

        //Accessing the added shape
        IAutoShape ashape = (IAutoShape)slide.getShapes().get_Item(index);

        try{
            //Creating output html file
            OutputStream os = new FileOutputStream(dataDir+ "first paragraph_Java.html");
            Writer writer = new OutputStreamWriter(os,"UTF-8");

            // Extracting first paragraph as HTML
            //Writing Paragraphs data to HTML by providing paragraph starting index, total paragraphs to be copied
            writer.write(ashape.getTextFrame().getParagraphs().exportToHtml(0, ashape.getTextFrame().getParagraphs().getCount(), null));
            writer.close();
        }
        catch(Exception fo)
        {
            fo.printStackTrace();

        }


    }
}




