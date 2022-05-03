import {IStudent} from '../model/IStudent';

export class StudentDao {
  // Danh sach Student
  static studentDao: IStudent[] = [
    {
      id: 1,
      name: 'Hau Le',
      age: 29,
      mark: 9,
      avatar: 'https://m.media-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_.jpg'
    },
    {
      id: 2,
      name: 'nguyen Van A',
      age: 20,
      mark: 4,
      avatar: 'https://m.media-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_.jpg'
    },
    {
      id: 3,
      name: 'Nguyen van B',
      age: 25,
      mark: 6,
      avatar: 'https://m.media-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_.jpg'
    },
    {
      id: 4,
      name: 'ngUyen van C',
      age: 27,
      mark: 7,
      avatar: 'https://m.media-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_.jpg'
    }
  ]
}
