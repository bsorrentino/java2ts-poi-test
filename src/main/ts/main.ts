

import {
  XSSFWorkbook,
  Paths
} from "excel-types";

import { streamFromIterator } from "./stream"

let workbook = new XSSFWorkbook( Paths.get("./AG.xlsx").toFile() );

type Row = org.apache.poi.ss.usermodel.Row;
type Cell = org.apache.poi.ss.usermodel.Cell;

streamFromIterator(workbook.iterator())
.flatMap( sheet => streamFromIterator(sheet.iterator<Row>()))
.flatMap( sheet => streamFromIterator(sheet.iterator<Cell>()))
.forEach( cell => print(cell.getStringCellValue()) )

;
