/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Slides.RemoveSlides;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class UsingSlideIndex
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UsingSlideIndex.class);

        //Instantiate a Presentation object that represents a Presentation1 file
        Presentation pres = new Presentation(dataDir+ "demo.pptx");

        //Removing a slide using its slide index
        pres.getSlides().removeAt(0);


        //Writing the Presentation1 file
        pres.save(dataDir+ "modified.pptx", SaveFormat.Pptx);

        System.out.println("Program executed successfully");
        
    }
}




