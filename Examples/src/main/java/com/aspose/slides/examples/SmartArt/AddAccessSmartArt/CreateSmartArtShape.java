/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.SmartArt.AddAccessSmartArt;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class CreateSmartArtShape
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateSmartArtShape.class);

        //Instantiate Presentation Class
        Presentation pres = new Presentation();

        //Get first slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Add Smart Art Shape
        ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.BasicBlockList);

        //Saving Presentation1
        pres.save(dataDir+ "SimpleSmartArt.pptx", SaveFormat.Pptx);
    }
}




