@Override
public VolunteerProfile createVolunteer(VolunteerProfile volunteer) {

    if (volunteer.getEmail() == null || volunteer.getEmail().isBlank()) {
        throw new RuntimeException("Email is required");
    }

    return volunteerProfileRepository.save(volunteer);
}
