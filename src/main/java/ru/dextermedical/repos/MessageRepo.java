package ru.dextermedical.repos;

import org.springframework.data.repository.CrudRepository;
import ru.dextermedical.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
