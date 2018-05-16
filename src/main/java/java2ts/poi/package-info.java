 @Java2TS(declare = {

    @Type(value=java.lang.Iterable.class),
    @Type(value=StreamSupport.class, export=true),
    @Type(value=java.util.Spliterator.class),
    @Type(value=java.util.stream.Stream.Builder.class),

 		@Type(value=java.util.Arrays.class, export=true),

 		@Type(value=java.nio.file.Files.class, export=true),
 		@Type(java.nio.file.Path.class),
 		@Type(value=java.nio.file.Paths.class, export=true),

 		@Type(value=java.net.URI.class, export=true),
 		@Type(java.net.URL.class),

        @Type(value=File.class, export=true),

        @Type(value=Sheet.class),
        @Type(value=XSSFSheet.class),
        @Type(value=Row.class),
        @Type(value=Cell.class),
 		@Type(value=XSSFWorkbook.class,export=true),



 })

package java2ts.poi;

import java.io.File;
import java.util.stream.StreamSupport;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bsc.processor.annotation.Java2TS;
import org.bsc.processor.annotation.Type;
