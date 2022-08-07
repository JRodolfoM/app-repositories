package br.com.jrmantovani.apprepositories.data.repositories

import br.com.jrmantovani.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}