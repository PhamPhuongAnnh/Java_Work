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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    private static final String PATH_FILE_CSV_Phong = curentDir + separator + "data" + separator + "Phong.csv";
    private static final String PATH_FILE_CSV_DATPHONG=curentDir + separator + "data" + separator + "DatPhong.csv";

    public void ghiFile(List<khachHang> list) {
        FileWriter fw = null;
        try {
            File f = new File(PATH_FILE_CSV);
            if (!f.exists()) {
                fw = new FileWriter(PATH_FILE_CSV, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                String[] header = {"Ma KH", "Ho Ten", "So CMND", "SĐT", "Tuoi", "PTTT"};
                csvWrite.writeNext(header);
                for (khachHang item : list) {
                    csvWrite.writeNext(new String[]{String.valueOf(item.getMaKhachHang()), item.getHoTen(), String.valueOf(item.getCMND()), String.valueOf(item.getSDT()), String.valueOf(item.getTuoi()), item.getPhuongThucThanhToan()});

                }
            } else {
                fw = new FileWriter(PATH_FILE_CSV, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                for (khachHang item : list) {
                    csvWrite.writeNext(new String[]{String.valueOf(item.getMaKhachHang()), item.getHoTen(), String.valueOf(item.getCMND()), String.valueOf(item.getSDT()), String.valueOf(item.getTuoi()), item.getPhuongThucThanhToan()});

                }
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

    public void ghiFilePhong(List<Phong> list) {
        FileWriter fw = null;
        try {
            File f = new File(PATH_FILE_CSV_Phong);
            if (!f.exists()) {
                fw = new FileWriter(PATH_FILE_CSV_Phong, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                String[] header = {"Ma Phong", "So Tang", "Loại Phòng", "Trang Thai", "Gia tien"};
                csvWrite.writeNext(header);
                for (Phong item : list) {
                    csvWrite.writeNext(new String[]{String.valueOf(item.getMaPhong()), String.valueOf(item.getSoTang()), String.valueOf(item.getLoaiPhong()),String.valueOf(item.getTrangThai()), String.valueOf(item.getGiaPhong())});

                }
            } else {
                fw = new FileWriter(PATH_FILE_CSV_Phong, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                for (Phong item : list) {
                    csvWrite.writeNext(new String[]{String.valueOf(item.getMaPhong()), String.valueOf(item.getSoTang()), String.valueOf(item.getLoaiPhong()), String.valueOf(item.getGiaPhong())});
                }
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
                khachHang kh = new khachHang(line[0], line[1], line[2], Integer.parseInt(line[3]), line[4], line[5]);
                list.add(kh);
            }
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return list;
    }

    public List<Phong> docFilePhong() throws CsvValidationException {
        FileReader fr = null;
        List<Phong> list = new ArrayList<>();
        try {
            fr = new FileReader(PATH_FILE_CSV_Phong);
            CSVReader csvReader = new CSVReader(fr);
            String[] line;
            line = csvReader.readNext();
            while ((line = csvReader.readNext()) != null) {
                Phong phong = new Phong(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]),line[3], Double.parseDouble(line[4]));
                list.add(phong);

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
 public void ghiFileDatPhong(List<DatPhong> list) {
     SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        FileWriter fw = null;
        try {
            File f = new File(PATH_FILE_CSV_DATPHONG);
            if (!f.exists()) {
                fw = new FileWriter(PATH_FILE_CSV_DATPHONG, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                String[] header = {"Ma Dat Phong", "Ma Phong", "Ma Khach Hang", "NgayDat", "NgayTRa", "TongTien"};
                csvWrite.writeNext(header);
                for (DatPhong item : list) {
                    csvWrite.writeNext(new String[]{String.valueOf(item.getMaDatPhong()), String.valueOf(item.getMaPhong()),String.valueOf(item.getMaKhachHang()),df.format(item.getNgayDat()) ,df.format(item.getNgayTra()), String.valueOf(item.getTongTien())});

                }
            } else {
                fw = new FileWriter(PATH_FILE_CSV_DATPHONG, true);
                CSVWriter csvWrite = new CSVWriter(fw, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                for (DatPhong item : list) {
                    csvWrite.writeNext(new String[]{String.valueOf(item.getMaDatPhong()), String.valueOf(item.getMaPhong()),String.valueOf(item.getMaKhachHang()), String.valueOf(item.getNgayTra()), String.valueOf(item.getNgayDat()), String.valueOf(item.getTongTien())});

                }
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
     public List<DatPhong> docFileDatPhong() throws CsvValidationException, ParseException {
         
         SimpleDateFormat df =new SimpleDateFormat("dd-MM-yyyy");
         
        FileReader fr = null;
        List<DatPhong> list = new ArrayList<>();
        try {
            fr = new FileReader(PATH_FILE_CSV_DATPHONG);
            CSVReader csvReader = new CSVReader(fr);
            String[] line;
            line = csvReader.readNext();
            while ((line = csvReader.readNext()) != null) {
                Date ngayDat = df.parse(line[3]);
                Date ngayTra = df.parse(line[4]);
                DatPhong datPhong = new DatPhong(line[0], line[1], line[2],ngayDat,ngayTra,Integer.parseInt(line[5]));
                list.add(datPhong);

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

