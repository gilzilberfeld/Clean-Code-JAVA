package testingil.cleancode.solutions.solidsolution.students;

import testingil.cleancode.solutions.solidsolution.BookAllowanceSetter;
import testingil.cleancode.solutions.solidsolution.Logger;
import testingil.cleancode.solutions.solidsolution.PackageType;
import testingil.cleancode.solutions.solidsolution.exceptions.InvalidEmail;
import testingil.cleancode.solutions.solidsolution.exceptions.NotImplemented;
import testingil.cleancode.solutions.solidsolution.universities.University;
import testingil.cleancode.solutions.solidsolution.universities.UniversityRepository;

public class StudentService {

    public void addIfValid(
            String emailAddress,
            int universityId,
            StudentRepository studentRepository,
            UniversityRepository universityRepository) {
        Logger.log("Start add student with email", emailAddress);

        validateEmail(emailAddress);

        if (studentRepository.exists(emailAddress)) {
            return;
        }

        University university = universityRepository.getByID(universityId);
        Student student = studentRepository.createStudent(emailAddress, universityId);

        PackageType type = university.getPackageType();

        BookAllowanceSetter allowanceSetter = new BookAllowanceSetter(student);
        allowanceSetter.setAllowance(type);

        studentRepository.add(student);

        Logger.log("End add student with email", emailAddress);

    }

    public Student getStudentsByUniversity() {
        throw new NotImplemented();
    }

    public Student getStudentsByCurrentlyBorrowedEbooks() {
        throw new NotImplemented();
    }

    private void validateEmail(String emailAddress) {
        if (emailAddress.isEmpty())
            throw new InvalidEmail("Empty");
    }
}
