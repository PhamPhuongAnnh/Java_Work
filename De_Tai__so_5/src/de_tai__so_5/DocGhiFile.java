/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DocGhiFile {

    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV = curentDir + separator + "data" + separator + "KhachHang.csv";

    public void ghiFile(List<khachHang> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(PATH_FILE_CSV, true);
            CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
//            String[] header = {"Ma KH", "Ho Ten", "So CMND", "SĐT", "Tuoi", "PTTT"};
//            csvWrite.writeNext(header);
            for (khachHang item : list) {
                csvWrite.writeNext(new String[]{String.valueOf(item.getMaKhachHang()), item.getHoTen(), String.valueOf(item.getCMND()), String.valueOf(item.getSDT()), String.valueOf(item.getTuoi()), item.getPhuongThucThanhToan()});

            }
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();

                } catch (IOException ex) {
                    Logger.getLogger(DocGhiFile.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public List<khachHang> docFile() throws CsvValidationException {
        FileReader fr = null;
        List<khachHang> list = new ArrayList<>();
        try {
            fr = new FileReader(PATH_FILE_CSV);
            CSVReader csvReader = new CSVReader(fr);
            String[] line;
            line = csvReader.readNext();
            while ((line = csvReader.readNext()) != null) {
                khachHang kh = new khachHang(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), line[5]);
                list.add(kh);

            }
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fr != null) {
                try {
                    fr.close();

                } catch (IOException ex) {
                    Logger.getLogger(DocGhiFile.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return list;
    }

}
