package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.repository.CrudRepository;
import vn.com.iuh.fit.BackEnd.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
