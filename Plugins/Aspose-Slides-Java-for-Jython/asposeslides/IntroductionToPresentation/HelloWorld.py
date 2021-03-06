from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ShapeType
from com.aspose.slides import FillType
from com.aspose.slides import SaveFormat
from java.awt import Color

class HelloWorld:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'IntroductionToPresentation/HelloWorld'
        
        # Instantiate Presentation
        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shape_type = ShapeType
        ashp = slide.getShapes().addAutoShape(shape_type.Rectangle, 150, 75, 150, 50)

        # Add ITextFrame to the Rectangle
        ashp.addTextFrame("Hello World")

        # Change the text color to Black (which is White by default)
        fill_type = FillType
        color = Color
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType(fill_type.Solid)
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Change the line color of the rectangle to White
        ashp.getShapeStyle().getLineColor().setColor(color.WHITE)

        # Remove any fill formatting in the shape
        ashp.getFillFormat().setFillType (fill_type.NoFill)

        # Save the presentation to disk
        save_format = SaveFormat
        pres.save(dataDir + "HelloWorld.pptx", save_format.Pptx)

        print "Document has been saved, please check the output file."

if __name__ == '__main__':        
    HelloWorld()