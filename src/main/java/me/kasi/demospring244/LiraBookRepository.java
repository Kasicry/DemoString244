package me.kasi.demospring244;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class LiraBookRepository implements BookRepository{
}
